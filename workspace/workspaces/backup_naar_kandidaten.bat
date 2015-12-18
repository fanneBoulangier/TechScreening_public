@echo off

call environment.bat

rmdir /Q /S %DEST%\workspace_backup
mkdir %DEST%\workspace_backup
xcopy /Q /S /E %DEST%\workspace %DEST%\workspace_backup
rmdir /Q /S %DEST%\workspace_backup\.metadata


SET BACKUP_NAME=%date:~10,4%%date:~7,2%%date:~4,2%_%time:~0,8%
SET BACKUP_NAME=%BACKUP_NAME: =0%
SET BACKUP_NAME=%BACKUP_NAME::=%

cd %ORIG%
cd ..
cd workspaces_kandidaten

mkdir %BACKUP_NAME%

cd %BACKUP_NAME%
%ORIG%\7z\7za a -r -tzip workspace_%BACKUP_NAME%.zip %DEST%\workspace_backup

echo.
echo Workspace backup successfull to: 
echo     '%cd%\workspace_%BACKUP_NAME%.zip'
echo.

cd %ORIG%


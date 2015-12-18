@echo off

call environment.bat

rmdir /Q /S %DEST%\solution_backup
mkdir %DEST%\solution_backup
xcopy /Q /S /E %DEST%\solution %DEST%\solution_backup


SET BACKUP_NAME=%date:~10,4%%date:~7,2%%date:~4,2%_%time:~0,8%
SET BACKUP_NAME=%BACKUP_NAME: =0%
SET BACKUP_NAME=%BACKUP_NAME::=%

cd %ORIG%
cd ..
cd solutions_kandidaten

mkdir %BACKUP_NAME%

cd %BACKUP_NAME%
%ORIG%\7z\7za a -r -tzip solution_%BACKUP_NAME%.zip %DEST%\solution_backup

echo.
echo solution backup successfull to: 
echo     '%cd%\solution_%BACKUP_NAME%.zip'
echo.

cd %ORIG%


@echo off

call environment.bat
SET WORKSPACE_NAME=php-cegeka
SET WORKING_DIRECTORY=C:\Temp\creating_php_workspace
SET PROJECT_NAME=php-recruitment
c:
cd\
"C:\Program Files\Unlocker\Unlocker.exe" /S %DEST%

rd /s /q %DEST%
%ORIG%\7z\7za x -y -o%DEST% %ORIG%\empty_workspace.zip
rd /s /q %WORKING_DIRECTORY%
mkdir %WORKING_DIRECTORY%

cd %WORKING_DIRECTORY%
echo.
echo including php-projects...
echo.
echo Exporting %PROJECT_NAME%
echo   one moment please ...
call git clone %GIT_RECRUTERING_URL%/%PROJECT_NAME% --branch master
echo.
echo Finished checking out projects.
echo.
echo Zipping the workspace
echo   one moment please ...
echo.
del %ORIG%\%WORKSPACE_NAME%.zip
%ORIG%\7z\7za a -r -tzip %ORIG%\%WORKSPACE_NAME%.zip %WORKING_DIRECTORY%\%PROJECT_NAME%\*.*
echo.
echo Workspace zipped in: %ORIG%\%WORKSPACE_NAME%.zip.
echo.
echo Workspace creation successfull!
echo.
pause
goto end

:end
rd /s /q %WORKING_DIRECTORY%
cd %ORIG%
@echo on

call environment.bat
call killall.bat
SET WORKSPACE_NAME=%1

c:
cd\
"C:\Program Files\Unlocker\Unlocker.exe" /S %DEST%
rd /s /q %DEST%

IF "%1"=="" GOTO help

%ORIG%\7z\7za x -y -o%DEST% %ORIG%\%WORKSPACE_NAME%.zip
ren %DEST%\%WORKSPACE_NAME% workspace
echo.
echo Installation of %WORKSPACE_NAME% successfull!
echo.
GOTO end
:help
echo.
echo Installation Failed!
echo.
echo Provide with this script a param which workspace to take...
echo eg: install workspace1
echo.

:end
cd %ORIG%

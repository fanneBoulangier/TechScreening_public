@echo off

call environment.bat
SET WORKSPACE_NAME=%1
SET WORKING_DIRECTORY=C:\Temp\creating_workspace
SET PROJECT_NAME=
SET ANOTHER_PROJECT=

IF "%1"=="" GOTO help

c:
cd\

rd /s /q %WORKING_DIRECTORY%
%ORIG%\7z\7za x -y -o%WORKING_DIRECTORY%\%WORKSPACE_NAME% %ORIG%\empty_workspace.zip
cd %WORKING_DIRECTORY%\%WORKSPACE_NAME%

echo.
echo Which projects to include in this workspace?
echo.

:addAProject
echo.
echo Possible projects are:
echo   one moment please ...
svn list %SVN_RECRUTERING_URL%
set /P PROJECT_NAME=Type a project name: %=%

echo Exporting %PROJECT_NAME%
echo   one moment please ...
svn export %SVN_RECRUTERING_URL%/%PROJECT_NAME%

set /P ANOTHER_PROJECT=Add another project? [Y/n] %=%
echo.
IF "%ANOTHER_PROJECT%"=="Y" GOTO addAProject

echo.
echo Finished checking out projects.
echo.
echo Starting Eclipse with this workspace - please add the projects manually, and close Eclipse again
echo.
%ECLIPSE_HOME%\eclipse.exe -data %WORKING_DIRECTORY%\%WORKSPACE_NAME%
echo.
echo Thank you!
echo.
echo Zipping the workspace
echo   one moment please ...
echo.
%ORIG%\7z\7za a -r -tzip %ORIG%\%WORKSPACE_NAME%.zip %WORKING_DIRECTORY%\%WORKSPACE_NAME%
echo.
echo Workspace zipped in: %ORIG%\%WORKSPACE_NAME%.zip.
echo.
echo Workspace creation successfull!
echo.

goto end

:help
echo.
echo Create Workspace Failed!
echo. 
echo Provide with this script a param which workspace to take...
echo eg: create_workspace workspace1
echo.

:end
cd %ORIG%
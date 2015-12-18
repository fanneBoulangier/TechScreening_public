@echo on

call environment.bat
call killall.bat
net start apache2.4
net start mysql

SET WORKSPACE_NAME=%1

IF "%1"=="" GOTO help

c:
cd\
"C:\Program Files\Unlocker\Unlocker.exe" /S %DEST%
"C:\Program Files\Unlocker\Unlocker.exe" /S %XAMMP_HTDOCS_HOME%\%WORKSPACE_NAME%
rd /s /q %DEST%
rd /s /q %XAMMP_HTDOCS_HOME%\%WORKSPACE_NAME%

echo Preparing Drupal site installation...
echo.
%ORIG%\7z\7za x -y -o%XAMMP_HTDOCS_HOME% %ORIG%\%DRUPAL_SITE_PACK%.zip
%ORIG%\7z\7za x -y -o%XAMMP_HTDOCS_HOME%\%WORKSPACE_NAME% %ORIG%\%WORKSPACE_NAME%-source.zip
%ORIG%\7z\7za x -y -o%DEST% %ORIG%\%WORKSPACE_NAME%-ws.zip
echo.
echo Installation of %WORKSPACE_NAME% successfull!
echo.
echo Starting Eclipse with this workspace - please open the project and close Eclipse.
echo.
%ECLIPSE_KANDIDAAT%\eclipse.exe -data %DEST% -refresh
echo Creating a clean database
echo.
cd %ORIG%
mysql -u root -h localhost drupal < drupal-cegeka-clean.sql

echo DONE - Installation successful!
pause
 
GOTO end
:help
echo.
echo Installation Failed!
echo.
echo Provide with this script a param which workspace to take...
echo eg: install drupal-cegeka
echo.

:end
cd %ORIG%

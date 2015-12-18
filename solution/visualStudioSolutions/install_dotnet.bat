@echo on

call environment.bat
call killall.bat
SET SOLUTION_NAME=%1

c:
cd\
"C:\Program Files\Unlocker\Unlocker.exe" /S %DEST%
rd /s /q %DEST%

IF "%1"=="" GOTO help

%ORIG%\7z\7za x -y -o%DEST% %ORIG%\%SOLUTION_NAME%.zip
ren %DEST%\%SOLUTION_NAME% solution
ren %DEST%\solution\%SOLUTION_NAME%.sln solution.sln
ren %DEST%\solution\%SOLUTION_NAME%.suo solution.suo
ren %DEST%\solution\%SOLUTION_NAME%.vsmdi solution.vsmdi
echo.
echo Installation of %SOLUTION_NAME% successfull!
echo.
GOTO end
:help
echo.
echo Installation Failed!
echo.
echo Provide with this script a param which workspace to take...
echo eg: install Solution1
echo.

:end
cd %ORIG%

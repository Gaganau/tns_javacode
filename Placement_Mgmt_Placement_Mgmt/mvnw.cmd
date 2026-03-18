@REM Maven Wrapper script for Windows
@REM Downloads Maven if not found and runs it

@echo off
setlocal

set "MAVEN_VERSION=3.9.6"
set "MAVEN_DIR=%USERPROFILE%\.m2\wrapper\dists\apache-maven-%MAVEN_VERSION%"
set "MAVEN_HOME=%MAVEN_DIR%\apache-maven-%MAVEN_VERSION%"
set "MAVEN_CMD=%MAVEN_HOME%\bin\mvn.cmd"
set "DOWNLOAD_URL=https://repo1.maven.org/maven2/org/apache/maven/apache-maven/%MAVEN_VERSION%/apache-maven-%MAVEN_VERSION%-bin.zip"
set "ZIP_FILE=%MAVEN_DIR%\apache-maven-%MAVEN_VERSION%-bin.zip"

if exist "%MAVEN_CMD%" goto runMaven

echo Maven not found, downloading Maven %MAVEN_VERSION%...
if not exist "%MAVEN_DIR%" mkdir "%MAVEN_DIR%"

powershell -Command "Invoke-WebRequest -Uri '%DOWNLOAD_URL%' -OutFile '%ZIP_FILE%'"
if errorlevel 1 (
    echo Failed to download Maven
    exit /b 1
)

echo Extracting Maven...
powershell -Command "Expand-Archive -Path '%ZIP_FILE%' -DestinationPath '%MAVEN_DIR%' -Force"
if errorlevel 1 (
    echo Failed to extract Maven
    exit /b 1
)

del "%ZIP_FILE%"

:runMaven
"%MAVEN_CMD%" %*

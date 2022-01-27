@ECHO OFF
ECHO #Usun wszystkie pliki build/libs/*.jar.
cd build\libs
IF EXIST *.jar (
    del *.jar
    ECHO 'File deleted'
    ) ELSE (
    ECHO 'file do not exists - nothing to del'
    )
cd ..\..
ECHO Build.....
call gradlew build
ECHO Build finished
cd build\libs
IF EXIST *.jar (
    ECHO 'Copying....'
    copy *.jar c:\project
    ECHO 'File copied'
    ) ELSE (
    ECHO 'file do not exists - something went wrong with build!!!'
    )
cd ..\..
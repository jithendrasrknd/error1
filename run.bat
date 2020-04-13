set projectLocation=C:\Users\jithendra\eclipse-workspace\AutomationFrameWorks\src\com\hrms\lib
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG%projectLocation%\testng.xml
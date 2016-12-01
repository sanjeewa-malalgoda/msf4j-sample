# M4F4J Sample

First build micro service package with java. Go to "/microservice/msf4j-server".
```
>>cd msf4j-server
>>mvn clean install
```

Then start micro service using following command.
It basically unlock commercial features and let us to enable flight recorder.
Also it will use predefined netty transport configuration file.
And also it will allocated some additional memory for runtime.
```
>>java -Xms1g -Xmx1g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:FlightRecorderOptions=loglevel=info -Dtransports.netty.conf=netty-transports.yml -jar target/swagger-jaxrs-server-1.0.0.jar
```

Now we can start our test using jmeter. Please use provided Jmeter script for that. We can start with Jmeter UI or headless mode.
Once its started let server to warm up for few minutes. Then move to next steps. Test jmeter script available in project root ("microservice-test.jmx").

Then we can start flight recorder recording using following command. It will collect stats for 30 seconds.
```
>>jcmd swagger JFR.start settings=profile duration=30s filename=stackobjectpool_2.jfr
```

Then check until flight recorder complete.
```
>>jcmd swagger JFR.check
```
Now you have complete JFR and we can analyze it with java mission control.

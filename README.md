# exchange-log-to-csv
Simple command line tool that converts a device's log from Exchange into CSV format.

Code is quite simple and it uses [JSefa library](http://jsefa.sourceforge.net/) to generate CSV output. As JSefa already support other formats as XML and FLR, it should take just a couple minutes to update the project to output those formats. Also, design is object oriented so, you could use any other converters that can be applied (i.e. Gson for generating JSON).

## Command usage

* Using JAR file directly:

'''
java -jar ExchangeToCsv.jar <input-file> [<output_file>]
'''

* Using the included script (or a variation for your platform):

'''
convert <input-file> [<output_file>]
'''

## Downloads

* [JAR Runnable File](https://github.com/luixal/exchange-log-to-csv/blob/master/downloads/ExchangeToCsv.rar)
* [Script for Windows/DOS Systems](https://github.com/luixal/exchange-log-to-csv/blob/master/downloads/convert.bat) (needs the JAR file to be on PATH)

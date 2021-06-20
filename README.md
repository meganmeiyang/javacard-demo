# javacard-demo
javacard 3.0.5 classic applet - a very simple applet demo

** I'm still working on this readme.. **
** 2021 June 20 **
First upload and simple introduction


## Environment
1. macOS bigSur
2. java16 installed and in PATH
3. ant 10.10
4. JDK3.0.5

## used Tools
1. Eclipse for java developer (2021 latest) 
2. any text editor / Atom will do
3. gp.jar: for card reader apdu exchange, applet installing on card etc.
4. ant-javacard.jar: for converting your javacard class to CAP ( to be installed in card).
above, big thumbs up goes to https://github.com/martinpaljak/ant-javacard  Martin Paljak, a hero-like name and indeed one.


## hardware
1. card reader: pc/sc compliant so that you can use it on mac without having troubles. I used, ACR112(contactless) by ACS, 
and SDI010 by SCM microsystems (both contact & contactless). They are both doing fine with my mac.
2. javacard: contact or contactless, mine are from Infineon.


## Website you will constantly view
1. globalplatform.org: to check on gp standards, GP2.2 or GP2.3. but not neccessary unless absolutely necessary... it is the most abstract technical documents 
i have ever read in my entire life. read it 100 times please and you will be more confused than the first time.
2. https://docs.oracle.com/javacard/3.0.5/api/index.html: to check on api usage

## extra stuff?
1. the javacard product specification, if you have. Even the most reowned javacard suppliers won't implement all apis and have all GP features uncomprised. 
Best is to be aware of its features ( especially related to memory handling, secuirty, cyypto algorithms), and its limitations ( support on API, 
support on GP secure channel, support on the GP commands, store key, store data, domain operations etc )

to be continued...

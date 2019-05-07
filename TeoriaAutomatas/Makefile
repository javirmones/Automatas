DIRJAVA= java/
DIRSRC = src/
DIRTEST= test/



JC= javac
JF= jflex
F =.flex
JV =.java
JA = java
CUP = cup
CP =.cup

default:
	make cflex
	make ccup
	make javac

cflex:
	$(JF) $(DIRSRC)*$(F) -inputstreamctor -d $(DIRJAVA)
ccup:
	$(CUP) -destdir $(DIRJAVA) -parser parser $(DIRSRC)*$(CP)
javac: 
	$(JC) -d $(DIRTEST) $(DIRJAVA)*$(JV)





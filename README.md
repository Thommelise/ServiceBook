Stack og Heapen
Stacken indeholder metoder og de lokale primitive datatyper som integers, booleans, flowting-point numbers, fixed-point numbers, chars og strings. Stacken indenholder også referencer på objekter.
Når en metode er afsluttet slettes den fra stacken sammen med de data typer og referencer den indeholder.
Hver gang man opretter et nyt objekt bliver det gemt på heapen.
stack hukommelse har kort levetid i forhold til heapen der lever fra start til slutning af programmet

JVM: 
Java Virtual Machine gør det mulig at compile java byte kode på flere forskellige platforme. så hvis man har installeret en JVM på en anden computer er det muligt at køre java programmer.

JRE:
Java Runtime Environment er en softwarepakke som der følger med når man downloader en JDK, man kan også hente den separat. Man skal bruge JRE pakken for at køre applikationer skrevet i java sproget.

JDK:
Java development kit, dette er en samling af værktøjer der gør det muligt for udviklere at dokumentere, skrive og teste java programmer. 

Intellij-IDEA:
Intellij er et af de mange forskellige programmer der indgår under det man kalder en IDE (integrated development environment), der findes bl.a. også Eclipse eller NetBeans. Intellij-IDEA er det program vi skriver vores java kode i, det understøtter flere forskellige sprog, men i SDJ bruger vi det til Java og JavaFX. Det at have en IDE er super vigtig da det indeholder mange hjælpe funktioner i forhold til når man koder, det er den der retter en hvis man laver syntaks fejl. 

Primitive typer:
Der findes 8 primitive typer, boolean, byte, char, short, int, long, float og double. Disse typer er byggestene i java og de er defineret på forhånd og man kan ikke ændre definitionen på dem.
Der findes de numeriske typer disse typer holder kun på numerisk data. De numeriske typer består af  short, int, long, float og double. 
De tekst baserede primitive typer byte and char, disse typer holder på karakterer.
Den tredje er boolean og null primitiver. 

Accessor består både af en getter og setter, man bruger getter når man skal have fat i felt værdien af en type.

 public int getDay() {
        return day;
    }
Her har vi lavet vores egen metode, en accessor metode der retunere en int som hedder day.


En setter bruges til at sætte værdien for en type

 public void setYear(int year) {
        this.year = year;
    }
    
Her setter vi year til at være en int og at den ikke skal retunere noget.
	
Metode signatur fortæller os hvilken metode der bruges og der er mange forskellige metoder.

public int getDay()´{}

dette er signaturen for en accessor også kaldet getter.

En retur type også kaldet metodes overskrift ( method header). 
Når man har en metode som skal returnere f.eks. en int. 
skal retur typen være den samme som den der returneres.

    public int getNumberOfServices() {
        return services.size();
    }
Her er retur typen int og den returnere størrelsen på services, hvilket er en int.

Hvis metoden ikke skal returnere noget benytter man void. 

public void addService(Service service) {
        services.add(service);
    } 
    
Denne metode tilføjer en service til services og returnere ikke noget.

Pakker i java er en gruppe af sammenhørende klasser. Man opdeler pakker herakisk i kataloger.

Klasser er blueprint/template som man kan danne objekter ud fra. Klassen beskriver variabler og metoder der beskriver objekternes opførsel.

Objekter er en instans af klassen. 

Referrence, det er jo noget af det fucking vigtigste :D 

 Text scenetitle = new Text("Pick Colour");
  
Text er data typen, scenetitle er en referrence til det nye Text("Pick Colour") objektet.  
	
	





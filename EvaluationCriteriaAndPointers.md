# Evaluation Criteria & Pointers

## Evaluation Criteria
- Zelfredzaamheid
- Core java concepten
- OO Java Concepten
    - Patterns
    - Inheritance
    - Polymorphisme
    - Refactoring
        - Waarom refactoren?
        - Zou je volgende week je code nog snappen?
        - Als ze antwoorden leesbaarheid
            - Iets inefficiënt maar leesbaar schrijven om te tonen dat refactoring meer is dan leesbaarheid vergroten
- Leervermogen
    - Nemen ze tips van de eerste oefening over naar de andere?
    - Schrijven ze testen in de tweede oefening
    - Vermijden ze een switch case?
- Communicatie
- Werken onder stress?
    - Niet doorslaggevend punt!
- Focus
- Clean code
    - Geen grote klasse/methodes schrijven
    - Nadenken over verantwoordelijkheden
- Culturele match
    - TDD
    - XP
    - Devops
- Intelligentie
    - Kan de kandidaat abstract denken
- Potentieel
    - Niet enkel kijken naar wat hij nu kan
    - Vermijd interviewer bias, namelijk je niet enkel concentreren op de kennis die jij als interviewer hebt.
    - Vraag de kandidaat of hij iets wil uitleggen dat nog niet aan bod is gekomen
    - Hoe gedroeg de kandidaat zich op vorige projecten
        - Wat waren zijn taken? Verantwoordelijkheden?
    - Heeft hij vermogen om te leren?
        - Hoe snel pikt hij dingen op?

## Pointers
### General pointers
#### Waar op letten tijdens een gesprek?
- Culturele match
- Intelligentie
- Potentieel

#### Feedback vragen over het interview
Hoe ging het? Hoe was het format? Is er nog iets dat er ontbreekt?  

### Skill matrix
Weten in welke schaal persoon ingedeeld kan worden  
Skills per niveau beschreven [in excel op Portal](https://portal.cegeka.com/kn/root/ContinuousLearning/SitePages/Personal%20Development.aspx).

#### Wat als het slecht gaat?
Indien de kandidaat echt niet goed is tijdens de exercises nog altijd gesprek met HR laten doorgaan.  
HR moet nog kort me de kandidaat kunnen afstemmen om goed gevoel over te houden van cegeka. (Is een keer verkeerd overgekomen)

#### Wat als de kandidaat veel stress heeft?
Proberen even een informeel moment in te lasten. Bijvoorbeeld iets samen gaan drinken.
	
####  Wat als het onduidelijk is wat het niveau is van de kandidaat?
- Is het aangenaam om met de kandidaat te werken?
    - Indien niet? Wat is de reden? Dat deel dieper onderzoeken
- Bij blijvende onzekerheid niet aannemen. Beter niet dan wel (we hebben al redelijk veel juniors)	

#### How to give feedback?
- Observation (specific behaviour)
- How it makes you feel (impact of that behaviour)
- Make a suggestion (What do you want to see differently) 

### Technical pointers
#### Pointer 1
Make sure they understand that for the first exercise, they should be writing code as if they're on a real project. So they can modify any class they want as well.

Maybe tell them _Write code like you would write production code for an important project with lots of developer rotation_.

Also tell them that we don't expect them to finish all the stories in 15 minutes, and that we will be joining them to pair on the stories in 15 minutes.

So that they don't make the excuse of _Well I could have written Unit Tests, but I was under time pressure and wanted to implement all stories asap. That's also why I have shitty design._

Also explain that for the first exercise, the MessageSender is something that they _can_ change if they want, but that `acceptMessage` is not a method they should implement. See below

#### Pointer 2
When you enter in the first exercise, and notice they haven't added any Unit Tests, ask them if they've ever heard of that.

Start writing Unit Tests while pairing, like we would on a real project and check how they react (when first writing a test before implementation).

#### Pointer 3
When they haven't finished Story 4 and 5, still try to ask about how they would implement those stories.

#### Pointer 4
Explain that they can use git if they want to (just have a local git init, no remote).

#### Exercise 1 - Design Choices
##### No ubiquitous language
You might notice that there's no real ubiquitous language in there, e.g. _forward to inbox_ vs. _categorize_, this is on purpose.

Also, the domain looks quite a lot like email forwarding, but we never use that word because we wanted to maintain the abstraction.

##### No MessageSender implementation
There is one in the Unit Tests though.

We wanted to make it clear that the MessageSender is something you, as a recruit, don't need to worry about exactly what it does.

We also did not want to infer _Dependency Injection_ on our `Inbox` class, so that a recruit can tell us about that if he/she wants to.

import java.util.Scanner;
public class GamePlay{
    private Scanner in = new Scanner(System.in);
    private Animal main;
    private int score;

    public GamePlay(Animal a) {
        this.main = a;
    }
    public void main (){

        System.out.println("Wind rushes past your ears as you chase your prey. Persistence is key in hunting, but being able to run at 45 km/hr for long periods of time certainly helps. " +
                "\n"+"The soon-to-be-meal is slowing down now, running on fumes and prime for attack. ");
        System.out.println("\n" + "Do you wish to attack? Press Y for Yes and N for No");

        if(decision()){
            System.out.println("You ready yourself and leap, biting down hard on the lone zebra’s testicles and wait for the prey to bleed out. " + "\n"+
                    "The zebra makes a few more faltering gallops and collapses from a mix of exhaustion and blood loss. " +"\n"+
                    "Your clan eagerly surrounds the meat, frenzied from the scent of blood. " + "\n\n");
            System.out.println("Do you attempt to eat first (and defy social order)? Enter Y for yes and N for no");

            if(decision()){
                System.out.println("Hyena clans follow a rigid social order. Defying that does not end well." + "\n"+
                        "Your attempt to eat first despite your low rank results in discontent, snarling, and bites from your clanmates" +"\n"+
                        "The younger pup of the alpha (therefore a higher rank) is particularly enthusiastic and in a nip gone wrong, you die.");
                gameOver();
            }else{
                followSocial();
            }
        }else{
            System.out.println("You ready yourself to attack, but the zebra unexpectedly speeds up." + "\n"+
                    "For a brief moment it appears that the zebra will escape, luckily a nearby clan member is ready. " + "\n"+
                    "They leap and bite down hard on the lone zebra’s testicles, then wait for the prey to bleed out." + "\n"+
                    "The zebra makes a few more faltering gallops and collapses from a mix of exhaustion and blood loss. " +"\n"+
                    "Your clan eagerly surrounds the meat, frenzied from the scent of blood. " + "\n\n");
            System.out.println("Do you attempt to eat first (and defy social order)? Enter Y for yes and N for no");
            if(decision()){
                System.out.println("Hyena clans follow a rigid social order. Defying that does not end well." + "\n"+
                        "Your attempt to eat first despite your low rank results in discontent, snarling, and bites from your clanmates" +"\n"+
                        "The younger pup of the alpha (therefore a higher rank) is particularly enthusiastic and in a nip gone wrong, you die.");
               gameOver();
            }else{
                followSocial();
            }
        }

    }
    private boolean decision(){
       String ans = in.nextLine();
        while(ans.equals("")){
            ans = in.nextLine();
        }
        if(ans.toUpperCase().equals("Y")){
            return true;
        }else if(ans.toUpperCase().equals("N")){
            return false;
        }else{
            System.out.println("Invalid Entry... please try again.");
            decision();
        }
        return false;
    }

    private void followSocial(){
        System.out.println("You wait for the higher ranked females to pick their selection of meat first, hoping that they’ll leave some of the good stuff, not just the bones again.\n" +
                "You need something a bit more substantial than bone marrow and minerals. \n" +
                "10 minutes in, and finally it’s your turn. You pounce and tear off chunks of the meat, desperately filling your stomach.\n");
        System.out.println("The sound of grass rustling alerts you and " +
                "Your clan to the lions’ presence seconds before they attack.\nOne male lion leaps out of concealment and clamps down on your clanmates throat, strangling her.\n");
        System.out.println("Do you defend your hard-won meal and your clan? Or do you flee? Enter Y to defend and N to flee");
        if(decision()){
            System.out.println("You and your clan won’t surrender your hard-won meal without a fight. \n" +
                    "Your alpha rallies her clan and you ready yourself. \n" +
                    "You will not let those mangy felines steal your meal again. You prepare to retaliate.\n" +
                    "The alpha quickly communicates the plan of defence to her clan. The strategy is a perfect mix of aggressive action and defence. \n" +
                    "You and the other females quickly execute the first steps of the plan, some fearlessly charging into the fray while others circle around trapping the lions.\n");
            System.out.println("More and more lions appear out of the bushes. It seems like a whole pride. While you and your clan could easily defend against a couple lions, is it worth the risk?\n\n" +
                    "Do you fall back or call for reinforcements from a nearby clan? \nPress Y to fight and call reinforcements and N to fall back.");
            if(decision()){
                System.out.println("“Wwwerrrooppp,” sounds off the alpha, calling a nearby clan in for reinforcements. \n" +
                        "But the number of lions does not suggest a good ending, the reinforcements need to arrive soon or the meat and your life will be in the lions’ hands.\n" +
                        "You leap and attempt to latch onto your target to no avail and retreat before the lion can counter.\nAnother attack, same results; you relentlessly attack and retreat along with your clanmates, testing the lion’s draining stamina.\n" +
                        "Suddenly, more lions appear out of the grass and it becomes evident your clan is on the losing side of this battle.\n");
                System.out.println("The lions ruthlessly decimate you and your clan. The reinforcements arrive too late, arriving at the scene of a massacre." +
                        " Sorry ya dead.");
                gameOver();
            }else{
                fallback();
            }
        }else{
            fallback();
        }
    }
    private void fallback(){
        System.out.println("Your alpha lets out a shrill laugh, a sign of submission, signaling the time for a retreat. The clan had already eaten all of the meat the lions desire.\nThis was not a hill worth dying on. Your clan flees, abandoning their kill to the lions.\n");
        System.out.println("You and your clan keep running, putting miles between you and the pride of lions. Half-heartedly searching for prey or recent kills.\nLuckily (for the lesser ranked anyway), in this midst of your run you find a rotting wildebeest.\nWhichever animal had killed it left more than enough food for your clan to scavenge.");
        System.out.println("Do you scavenge the wildebeest and fill your stomach or keep running? Before you make your decision, do you want more information on Hyenas? Y or N");
        if(decision()){
            System.out.println(scavenge());
            scavengeYN();

        }else{
            scavengeYN();
        }
    }
    private void scavengeYN(){
        System.out.println("Do you scavenge the wildebeest and fill your stomach or keep running? Enter Y to scavenge and N to run");
        if(decision()){
            System.out.println("Soon, the sound of bones crunching and meat ripping filled the air as your clan descended on the feast; easily consuming the leftover meat and minerals the wasteful predator left behind.\nMinutes later, all that is left of the wildebeest is a bloody spot upon the ground and a clan of satisfied hyenas.");
           mate();
        }else{
            System.out.println("Disregarding the feast before you, your clan keeps running. Desperate to put more distance between them and the lions.\nUnfortunately, some members of your clan are weak and hungry, they start falling behind. \nWhile at times hyena clans can disperse/dissolve and members can leave, it is rare and males are usually the migratory members. Clans need to take care of their members...");
            System.out.println("Also HYENA FACT: hyenas never know when they will next eat, so when the opportunity presents itself, they will gorge themselves.");
            gameOver();
        }
    }
    private String scavenge(){
        return "Hyenas are amazing scavengers in that they can eat almost anything. Researchers are continually astonished at the strength of a hyenas stomach.\n" +
                "Hyenas have been seen eating a rotting carcass for months on end, despite the increasing putrefaction... similarly hyenas will eat the dung of wildebeests and wild dogs.\n"+
                "So, when deciding on whether or not to scavenge, remember that hyenas can eat almost anything organic and that while you might have eaten someone of a lower rank than you might not have.\nNow back to the game....\n\n";
    }
    private void mate(){
        System.out.println("Your clan continues on at a wandering pace, the urgent rush for survival passed. The clan continues to keep watch for potential meals, but the need has faded.\n" +
                "Wandering the planes of the savannah, full and content, a different need sparks within you. Do you wish to mate? Yes (Y) or No (N)?\n");
        if(decision()){
            System.out.println("You single out a male of the clan, granting him the pleasure of mating with you.... the mating is successful. Do you want to raise cubs?\nBefore you decide here is some more information about hyena pregnancy..\n\n");
            hyenaInfoPreg();
            if(decision()){
                hyenaPreg();
            }else{
                minigamePREG();
                mate2();
            }
        }else{
            System.out.println("Mating is a natural aspect of life. In fact, for most animals pregnancy is a matter of utmost survival");
            System.out.println("Hyenas are no exception. Many hyenas are quite sexually active, even without the purpose of cubs. This is due to the biology of hyenas.\nMating is a common occurrence, deciding not to mate when there are no other urgent needs is against hyena behavioural trends.");
            gameOver();

        }
    }
    private void mate2(){
        if(score>5){
            System.out.println("Triumphant over the tourists, your clan meanders away, contentedly scanning the horizon for trouble and perhaps for food to eat later." +
                    "\nLazily walking toward the river, you head for a drink of water keeping a half-hearted eye out for predators.\nYou drink until your stomach feels slightly bloated, storing up in case water is hard to come by in the next few days.\n" +
                    "Your clan begins to laze, soaking up the midday African sun. With nothing else to do, you watch as males compete for your attention.\n" +
                    "You eventually select one of the stronger males of the clan. You know that your genes will produce strong cubs and you can't wait to raise them.");
            hyenaPreg();
        }
    }
    private void hyenaInfoPreg(){
        System.out.println("Hyena pregnancies are a very interesting phenomena due to the biology of female hyenas.\n" +
                "Instead of the more typical female genitals, female hyenas have what is known as a pseudo-penis.\nThe pseudo-penis is on average an 8 inch clitoris, through which female hyenas urinate, mate, and give birth.\n" +
                "Because of the pseudo-penis, only around 40% of cubs survive pregnancy, most die during birth via suffocation.\n" +
                "However, one benefit to the pseudo-penis is that it is essentially a built in form of birth-control.\nIf the female hyena does not like her mate or does not wish to reproduce she can simply urinate and flush it out of her system.\n" +
                "This is an amazing benefit for female hyenas as parenthood as a hyena is an intense experience.\n" +
                "Male hyenas provide no support for their cubs, cubs are raised communally by the females of the clan (though only the mothers suckle their offspring.\n\n" +
                "If you wish to have cubs (a primary drive for most animals and necessary for survival), you need to be prepared... pregnancy and motherhood as a hyena is intense.\n" +
                "Do you have cubs or do you not? Enter Y to have cubs, N to not. FAIR WARNING: you will need to eventually have cubs.... though there will be another opportunity");
    }
    private void hyenaPreg(){
                System.out.println("Months go by in an endless cycle of hunt, eat, defend, repeat. The only difference being your slowly growing stomach.\n" +
                        "Now, the time is near and labour approaches. Are you ready to give birth? Y/N");
                if(decision()){
                    System.out.println("Yes? Get ready for some pain...");
                }else{
                    System.out.println("No? Well too bad they are coming whether you are ready for the pain or not...\nUnfortunately, not only is there a high death rate for cubs, the death rate is high for mothers as well. Being uncommitted to giving birth is not possible for female hyenas.\n" +
                            "Female hyenas must give birth through a canal that is an inch-wide, making the process incredibly painful and dangerous. You must be ready to give birth..");
                    gameOver();
                }
                System.out.println("Labour hits you hard, the pain is excruciating. You begin too push, trying as hard as you can to get a hyena cub through the hair-pin turn and tight squeeze of your clitoris.\n" +
                        "Will the cubs survive? Or rather, what are the odds of them surviving?\n" +
                        "Pick a number between 1-3.");
                int num = in.nextInt();
                int num2 = (int)Math.random()*3 + 1;
                if(num==num2){
                    System.out.println("Congratulations! All of your cubs survived!");
                    System.out.println("\n\nBorn ready to fight, your cubs are constantly feuding between each other. As the younger cubs retreat to their den, the eldest waits, ready to ambush them. The eldest bombards their younger siblings until they are too terrified to leave the den.\n" +
                            "The male cub succumbs first, naturally submissive, he starves rather than fight their siblings for food.\n" +
                            "Next to go is the younger female, beaten down and weary, one day she collapses in a pile of blood and sweat never to get back up.");

                }else{
                    System.out.println("Unfortunately, the lack of air got to one of your cubs. They died of asphyxiation. However, your other cubs survived! 2 out of 3 is not bad.");
                    System.out.println("\n\nBorn ready to fight, your cubs are constantly feuding between each other. As the younger cub retreats to their den, the eldest waits, ready to ambush them.\nThe eldest bombards their younger sibling until they are too terrified to leave the den.\n" +
                            "The young male cub succumbs, naturally submissive, he starves rather than fight their sibling for food.\n" );
                }
                System.out.println("With one cub left, you devote your time to caring for her. Raising her right, teaching her how to survive the wilds of the savannah.\n" +
                        "You ensure that she gets enough food deserving of your rank. You teach her to be more aggressive, how to fight and hunt, how to avoid humans and lions.\n" +
                        "Eventually, you no longer need to defend her place at the table\n" +
                        "She can defend herself, and she is deserving of your rank in the pack. She knows not to cross the humans, nor to pick a fight she can't win.\nShe can take down a full-grown zebra by herself but is also able to flawlessly work as a clan.\n" +
                        "She knows her place, and does not dare tread out of line.\n" +
                        "You fellow clan-mates teach her like their own, she learns family and teamwork. She learns to network and communicate.\n" +
                        "Before you know it, the males her age are migrating clans begging for acceptance and your cub is grown. A clan-mate in her own right.\n" +
                        "\n\nYou run, sprint faster than ever before, eyes ahead of you. You can't afford to lose focus, they already split up your clan.\n\"Vrooooomm\" roared the packed vehicle racing behind you. You can hear the humans jeering. Theorizing about your numerous crimes against nature.\n" +
                        "\"I bet it's running back to its master, the WITCH\" one superstitious human screamed. Another claimed we had dug up and eaten their dead family." +
                        "\nYou see trees ahead, perhaps in there you can lose them. As you draw near you see a bushy mane of fur.\nDo you head into lion pride or brave the humans behind you? Y to charge into a lion pride, N to brave the humans.");
                if(decision()){
                    //Lion Pride
                    System.out.println("Diving head first into lion territory, you narrowly escape your vengeful pursuers. Pausing briefly to catch your breath, you get ready for another long sprint.\n" +
                            "But, your pause, though brief, was too long. Perked up by the commotion, the lions cunningly surrounded the area. You're trapped. The lions mercilessly hone in on you.\n" +
                            "Attacking relentless until your last breath.\n\n");
                    gameOver();
                }else{
                    //Human attack
                    //mirrors the hunting from the beginning.
                    System.out.println("You take a sharp turn, heading for the grassy planes, away from all roads. Hoping they will not be able to follow you.\n" +
                            "The jeep slows, struggling along the untrod terrain, but they follow you, relentless and fueled by misplaced anger and generations of intolerance.\n" +
                            "Running at full speed, you try attempt to outrun the jeep, but machines don't tire. You begin to falter, exhausted.\n" +
                            "The humans tirelessly chase and you are running on fumes. After a few faltering steps, you collapse in a pile of exhaustion.\n" +
                            "As they draw near, the humans mock your weak flails, your last attempt at escape. Looming over you, you close your eyes, resign to your fate as you draw your last breath.\n\n");
                    gameOver2();
                }

    }
    //Mini game to delay time for people who don't want to be pregnant yet
    private void minigamePREG(){
        score = 0;
        System.out.println("While wandering the planes of the savannah you and your clan happen upon a bunch of tourists (rare due to the way tours are ran)"+
                "As you draw near, you over hear the humans talking!\n" +
                "\"Oh, it's just a hyena I thought it was something cool\", the teen in the safari vehicle mutters sitting down to stare out the window moodily.\n" +
                "As the child whined \"Ewwwwww, they're so ugly\".\n" +
                "The parents attempted to console the children, placating with useless statements about how they will see lions and cheetahs and other cool animals later,\n" +
                "while the guide delivered warnings to the family to be careful at night. That hyenas may be cowardly scavengers, but they will attack if you are by yourself.\n\n" +
                "You know that that is not true, well some of it isn't... but which parts? See if you can tell which is FACT and which is FICTION");
        System.out.println("\n\nFACT or FICTION\n Test your knowledge of hyenas and prove some tourists wrong! Enter Y if you believe that the statement if fact/true and enter N if you believe the statement is false/fiction!\n\n ARE YOU READY TO PLAY?\n" +
                "Question 1: Spotted hyenas are primarily scavengers.");
        if(decision()){
            System.out.println("WRONG, Spotted hyenas kill up to 95% of their food. Other species of hyenas, such as the brown and spotted hyenas, are primarily scavengers but they also hunt their own prey.");
            question2();
        }else{
            System.out.println("CORRECT, Spotted hyenas kill 95% of their food though other types of hyenas are primarily scavengers.");
            score++;
            question2();
        }

    }

    private void question2(){
        System.out.println("Question 2: Hyenas are stupid and oafish.");
        if(decision()){
            System.out.println("FALSE, hyenas are actually some of the most intelligent carnivores. They can compete with primates in terms of problem-solving and teamwork");
            question3();
        }else{
            System.out.println("TRUE! Hyenas are not stupid, they are some of the most intelligent carnivores and rival some primates.");
            score++;
            question3();
        }
    }
    public void question3(){
        System.out.println("Question 3: Hyenas live in a matriarchal clan.");
        if(decision()){
            System.out.println("CORRECT! Hyenas do live in a matriarchal clan. In fact, males of the clan are the lowest ranked members");
            score++;
        }else{
            System.out.println("False, female hyenas rule the clan.");
        }
        question4();
    }
    public void question4(){
        System.out.println("Question 4: Female hyenas are the sole providers to cubs in the clan.");
        if (decision()) {
            System.out.println("TRUE! Female hyenas ARE the sole providers within the clan!");
            score++;
        }else{
            System.out.println("INCORRECT! Male hyenas do nothing for the cubs, they are simply \"sperm donors\".");
        }
        question5();
    }
    public void question5(){
        System.out.println("Question 5: Hyenas are hermaphrodites.");
        if(decision()){
            System.out.println("FALSE, hyenas were thought to be hermaphrodites for many years because female hyenas have what is called a pseudo-penis.");
        }else{
            System.out.println("True! Hyenas are not hermaphrodites, though they were thought to be for many years.");
            score++;
        }
        question6();
    }
    public void question6(){
        System.out.println("Question 6: Once matured, male hyenas migrate from the clan they were born in to a new clan.");
        if(decision()){
            System.out.println("TRUE, male hyenas tend to migrate to new clans once mature.");
            score++;
        }else{
            System.out.println("FALSE, males do not tend to stay with their birth packs. They tend to immigrate.");
        }
        question7();
    }
    public void question7(){
        System.out.println("Question 7: Hyenas cubs inherit the rank of their father and work their way up.");
        if(decision()){
            System.out.println("Incorrect, hyena cubs inherit their mother's rank.");
        }else{
            System.out.println("Correct, hyena cubs inherit their rank from their mother.");
            score++;
        }
        question8();
    }
    public void question8(){
        System.out.println("Question 8: Hyena cubs have a tendency to commit fratricide.");
        if(decision()){
            System.out.println("This is true! Hyena cubs are born ready to fight and aggressive. Fratricide is a common occurrence.");
            score++;
        }else{
            System.out.println("Hyenas do tend to kill their siblings. It is survival of the fittest and hyenas are naturally aggressive.");
        }
        question9();
    }
    public void question9(){
        System.out.println("Question 9: Hyenas are mean to lions.");
        if(decision()){
            System.out.println("FALSE, in reality lions are usually the aggressors in the feud between lions and hyenas.");
        }else{
            System.out.println("True, while hyenas are fully able to retaliate and may start the fight occasionally it is usually lions who initiate.");
            score++;
        }
        question10();
    }
    public void question10(){
        System.out.println("Question 10: Hyenas are the scourge of the Savannah.");
        if(decision()){
            System.out.println("FALSE, hyenas are a needed aspect of the Savannah. They clean up wasted food and keep populations steady.");
        }else{
            System.out.println("TRUE, hyenas are very needed in the Savannah.");
            score++;
        }

        System.out.println("You scored " + score + " out of 10.");
        if(score<5){
            System.out.println("You failed to prove the tourists wrong in this game of FACT or FICTION! Better luck surviving next time!");
            gameOver();
        }else{
            System.out.println("Congratulations! You know a lot about hyenas! You beat the tourists! Have fun with the rest of the game and good luck surviving the day!");
        }
    }
    private void gameOver(){
        System.out.println("GAME OVER... try again? \n Y or N?");
        if(decision()){
            System.out.println("Do you wish to play as the same avatar? Or do you want to create a new one?\nEnter Y to play as the same avatar. N to not.");
            if(decision()){
                GamePlay g = new GamePlay(this.main);
                g.main();
            }else {
                LoadScreen l = new LoadScreen();
                l.startGame();
            }
        }else{
            LoadScreen l = new LoadScreen();
            l.endGame();
        }
    }
    private void gameOver2(){
        System.out.println("GAME OVER... technically you have completed the game though you have not survived.\n" +
                "No one survives this game.");
        LoadScreen l = new LoadScreen();
        l.endGame();
    }

}

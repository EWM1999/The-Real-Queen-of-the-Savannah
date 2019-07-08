import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class LoadScreen extends JPanel implements ActionListener{
    static Scanner in = new Scanner(System.in);
    static JFrame frame;
    static JTextField t;
    static JTextArea textArea;
String x = "";
//    private static void createAndShowGUI() {
//        //Create and set up the window.
//        frame = new JFrame("The Real Queen of the Savannah");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Add the ubiquitous "Hello World" label.
//        frame.add(new LoadScreen());
//
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
//    public LoadScreen(){
//        JLabel label = new JLabel("The Real Queen of the Savannah");
//        this.add(label);
//        t = new JTextField();
//        t.setText("Enter Y to Play");
//        this.add(t);
//       t.addActionListener(this::actionPerformed);
//       if(x.equals("Y")){
//           label.setText("IT WORKS");
//       }
//
//
//    }

    public void actionPerformed(ActionEvent e) {
        x=t.getText();
    }

    private static void gui(String arg){

        JLabel l = new JLabel(arg);
        frame.getContentPane().add(l);

    }
    private static String getInput(){
        t = new JTextField(20);
        frame.getContentPane().add(t);
        String info = t.getText();
        return info;
    }
    private static void output(String x){
        t = new JTextField();
        frame.getContentPane().add(t);
        t.setText(x);
    }
    private final static String newline = "\n";

    public static void main(String[]args){
        //createAndShowGUI();
        System.out.println("The Real Queen of the Savannah\n\nEnter Y to play");
        if(in.nextLine().toUpperCase().equals("Y")){
            startGame();
        }

    }
    public static void startGame(){
        System.out.println("Create your avatar: ");
        System.out.println("What is your avatar's name: ");
        String name = in.nextLine();
        System.out.println("How old is your avatar? ");
        int age = in.nextInt();
        Hyena h = new Hyena(name, age);
        System.out.println(name + " is a " + age + " year old " + h.getGender()+" Hyena. Their rank in the pack of 20 is " + h.getRank());
        System.out.println("The goal of this game is to survive a day in the life of a Hyena... this means you need to act and think like a hyena. If you die or do not act like an hyena, you lose.\nBefore we begin, would you like some background information on Hyenas? Enter 'Y' for yes and 'N' for no");
        String answer = in.nextLine();
        while(answer.equals("")){
            answer = in.nextLine();
        }
        if(answer.toUpperCase().equals("Y")){
            Background b = new Background();
            System.out.println(b.toString());
        }
        System.out.println( "\n\n"+"Now that you have your character, the real story of the Queen of the Savannah may begin... Are you ready?\nEnter Y to start the game\n");
        answer = in.nextLine();
        while(answer.equals("")){
            answer = in.nextLine();
        }
        if(answer.toUpperCase().equals("Y")){
            GamePlay g = new GamePlay(h);
            g.main();
        }
    }
    public static void endGame(){
        System.out.println("Thanks for playing!");
    }


}

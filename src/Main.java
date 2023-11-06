import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerForWords = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);


        String button;
        String foundWord = null;
        do {
            menu();
            System.out.println();
            button = scannerForWords.nextLine();
            if (button.equals(">")) {
                Integer number = Integer.valueOf(foundWord);
                    if (foundWord != null) {
                        if(foundWord.equals(">")){
                            number +=2;
                        }
                        number += 1;
                        String strNumber = Integer.toString(number);
                        System.out.println(TVcontroller(strNumber));
                    }
            }
            if (button.equals("<")) {
                for (int i = 1; i > 0; i--) {
                    if (foundWord != null) {
                        Integer number = Integer.valueOf(foundWord);
                        number =number -1;
                        String strNumber = Integer.toString(number);
                        System.out.println(TVcontroller(strNumber));
                    }
                }
            }else foundWord = button;
            String remoteCont = TVcontroller(button);
            System.out.println(remoteCont);
        } while (!button.equals("off"));



        if(button.equals("off")) {
            do {
                menu();
                System.out.println();
                button = scannerForWords.nextLine();

                if (!button.equals("on")) {
                    System.out.println(TVcontroller("return default"));
                    do{ menu();
                        System.out.println();
                        button = scannerForWords.nextLine();
                        if (!button.equals("on")) {
                            System.out.println(TVcontroller("return default"));
                        }else {
                            System.out.println(TVcontroller(button));
                            do {
                                menu();
                                System.out.println();
                                button = scannerForWords.nextLine();
                                String remoteCont = TVcontroller(button);
                                System.out.println(remoteCont);
                            } while (!button.equals("off"));
                        }
                    }while(!button.equals("on"));
                }else {
                    System.out.println(TVcontroller(button));
                    do {
                        menu();
                        System.out.println();
                        button = scannerForWords.nextLine();
                        String remoteCont = TVcontroller(button);
                        System.out.println(remoteCont);
                    } while (!button.equals("off"));
                }
            }while(button.equals("on"));
        }

    }


    public static void menu() {
        String blue = "\u001B[34m";
        String resetColorCode = "\u001B[0m";
        System.out.println(blue +"""
                *____________=___________*
                |  ___             __    |  off - телевизорду өчүрүү;
                | [off]           [on]   |  
                |  ---             --    |  on - телевизорду жандыруу;
                | _____   _____   _____  |  
                | { 1 }   { 2 }   { 3 }  |  1 - КТРК;
                | -----   -----   -----  |  
                | _____   _____   _____  |  2 - Баластан;
                | { 4 }   { 5 }   { 6 }  |  
                | -----   -----   -----  |  3 - Маданият;
                | _____   _____   _____  |  
                | { 7 }   { 8 }   { 9 }  |  4 - Музыка;
                | -----   -----   -----  |  
                | _____   _____   _____  |  5 - Ала-Тоо;
                | | + |   { 0 }   | [>|  |  
                | |   |   -----   |   |  |  6 - Спорт;
                | | - |           | # |  |  
                | -----   |-----| -----  |  7 - ЭЛТР;
                |         |  ^  |        |  
                |         |  -  |        |  + - үндү көбөйтүү;
                |       ----------       |  
                | ------|  ----  |------ |  - - үндү азайтуу;
                || < |  | |menu| |  | > ||  
                | ------|  ----  |------ |  menu- телевизордогу бардык каналдардын тизмеси;
                |       ----------       |  
                |         |  -  |        |  ^же> - кийинки каналга которуу;
                |         |  v  |        |  
                |         |-----|        |  <жеv - мурдагы каналга которуу;
                *------------------------*   
                """ + resetColorCode);
    }

    public static String TVcontroller(String chanels) {
        String controller = """
                """;
        switch (chanels) {
            case "off":
                controller = """
                               V
                        -------------------------------------------------------------------
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                             TV IS OFF.                          |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        -------------------------------------------------------------------
                        """;
                break;
            case "on":
                controller = """
                               V
                        -------------------------------------------------------------------
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                             WELCOME!                            |
                        |                             TV IS ON.                           |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        -------------------------------------------------------------------
                        """;
                break;
            case "menu":
                controller = """
                          V
                        -------------------------------------------------------------------
                        |             1 - КТРК;                                            |
                        |                                                                  |
                        |             2 - Баластан;                                        |
                        |                                                                  | 
                        |             4 - Музыка;                                          |
                        |                                                                  |
                        |             5 - Ала-Тоо;                                         |
                        |                                                                  |
                        |             6 - Спорт;                                           |
                        |                                                                  |
                        |             7 - ЭЛТР;                                            |
                        |                                                                  |              
                        -------------------------------------------------------------------
                        """;
                break;
            case "+":
                controller = """
                               V
                        -------------------------------------------------------------------
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                     *********************************           |
                        |                     * -------------->үн жогорулоодо *           |
                        |                     *********************************           |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        -------------------------------------------------------------------
                        """;
                break;
            case "-":
                controller = """
                               V
                        -------------------------------------------------------------------
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                     *********************************           |
                        |                     * үн азаюуда    <-------------- *           |
                        |                     *********************************           |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        |                                                                 |
                        -------------------------------------------------------------------
                        """;
                break;
                case "1":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                               КТРК                              |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;

                case "2":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             Баластан                            |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;

                case "3":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             Маданият                            |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;
                case "4":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             Музыка                              |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;

                case "5":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             Ала-Тоо                             |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;
                case "6":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             Спорт                               |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;
                case "7":
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                             ЭЛТР                                |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
                    break;
            case ">", "^":
                break;

            case"<", "v":
                break;

                default:
                    controller = """
                                   V
                            -------------------------------------------------------------------
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                ТЕЛЕВИЗОР ӨЧҮК ЖЕ МЫНДАЙ КАНАЛ ЖОК.              |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            |                                                                 |
                            -------------------------------------------------------------------
                            """;
            }

            return controller;
        }
}


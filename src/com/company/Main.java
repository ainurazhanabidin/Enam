package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {


//        Кундорго enum тузунуз (Monday, Tuesday ...)
//консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда
//    "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//        Жуманын кундорун кыргыз тилинде корсотунуз.


        Scanner scanner=new Scanner(System.in);
        String a= scanner.nextLine();
        Week week=Week.DUISHOMBU;
        Week week1=Week.JUMA;
        Week week2=Week.SHEISHEMBI;

        switch (a){
            case "DUISHOMBU":
                System.out.println(week+" дуйшомбу куну жава окуйм");
                break;
                case "SHEISHEMBI":
                System.out.println(week2+" англис тилин окуйм" );
                break;

                case "JUMA":
                System.out.println(week1+ " орус тилин окуйм");
            default:
                }


        }



    }


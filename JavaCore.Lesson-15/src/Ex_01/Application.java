package Ex_01;

import java.util.Scanner;

public class Application {
	
	static void menu() {
		System.out.println("Натисніть 1, щоб додати учансника клубу");
		System.out.println("Натисніть 2, щоб додати тварину учаснику клубу");
		System.out.println("Натисніть 3, щоб видалити тварину учасника клубу");
		System.out.println("Натисніть 4, щоб видалити учасника клубу");
		System.out.println("Натисніть 5, щоб видалити конкретну тварину у всіх учасників");
		System.out.println("Натисніть 6, щоб вивести на екран весь зооклуб");
		System.out.println("Натисніть 7, щоб вийти з програми");
	}

	public static void main(String[] args) {
		
		ZooClub zooClub = new ZooClub();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1 :{
				zooClub.addClubMember();
				break;
			}
			case 2 :{
				zooClub.addAnimalForMembers();
				
				break;
			}
			case 3 :{
				zooClub.removeAnimalForOneMember();
				break;
			}
			
			case 4 :{
				zooClub.removeMember();
				break;
			}
			case 5 :{
				zooClub.removeAnimalForAllMember();
				break;
			}
			case 6 :{
				zooClub.viewAll();
				break;
			}
			case 7 :{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Немає такого значення, введіть число від 1 до 7");
				break;
			}
		
		}
		


	}

}



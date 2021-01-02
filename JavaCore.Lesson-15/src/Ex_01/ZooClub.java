package Ex_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {
	
	Map<Person, ArrayList<Animal>> zooClub = new HashMap<Person, ArrayList<Animal>>();
	
	public void addClubMember() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ��'� �������� �����: ");
		String name = sc.next();
		
		System.out.println("������ �� �������� �����: ");
		int age = sc.nextInt();
		
		Person person = new Person(name, age);
		
		zooClub.put(person, new ArrayList<Animal>());
		
		System.out.println("����� ������� �������� " + person.toString() +" ������ �������");
		
	}
	
	public void addAnimalForMembers() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ��'� �������� �����: ");
		String name = sc.next();
		
		System.out.println("������ �� �������� �����: ");
		int age = sc.nextInt();
		
		boolean correct = isMemberExist (zooClub, name, age);
		
		if (correct) {
			System.out.println("������ ����� �������: ");
			String typeAnimal = sc.next();
			
			System.out.println("������ ��'� �������: ");
			String nameAnimal = sc.next();
			
			Animal animal = new Animal(typeAnimal, nameAnimal);
			
			Iterator<Entry<Person, ArrayList<Animal>>> iterator1 = zooClub.entrySet().iterator();
			
			while (iterator1.hasNext()) {
				Entry<Person, ArrayList<Animal>> entry =  iterator1.next();
				if(entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
					ArrayList<Animal> animalArray = entry.getValue();
					animalArray.add(animal);
					System.out.println("������� ������ "+ animal.toString() +" �������� " + entry.getKey());
				}
				
			}
		} else {
			System.out.println("���� ������ ��������");
		}
	}
	
	public void removeAnimalForOneMember() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ��'� �������� �����: ");
		String name = sc.next();
		
		System.out.println("������ �� �������� �����: ");
		int age = sc.nextInt();
		
		boolean correct = isMemberExist (zooClub, name, age);
		
		if (correct) {
			System.out.println("������ ����� �������: ");
			String typeAnimal = sc.next();
			
			System.out.println("������ ��'� �������: ");
			String nameAnimal = sc.next();
			
			
			boolean corectAnimal = isAnimalExist (typeAnimal, nameAnimal);
			
			if (corectAnimal) {
				Iterator<Entry<Person, ArrayList<Animal>>> iterator2 = zooClub.entrySet().iterator();
				while (iterator2.hasNext()) {
					Entry<Person, ArrayList<Animal>> entry2 =  iterator2.next();
					ArrayList<Animal> animalArray = entry2.getValue();
					
					Iterator<Animal> iterator3 = animalArray.iterator();
					
					while (iterator3.hasNext()) {
						Animal animal = iterator3.next();
						if (animal.getNameAnimal().equalsIgnoreCase(nameAnimal) && animal.getTypeAnimal().equalsIgnoreCase(typeAnimal)){
				iterator3.remove();
				System.out.println("������� "+ animal.toString() +" �������� � ��������" + entry2.getKey());
				}
					}
				}}
					else {
				System.out.println("���� ���� ����� � �������� �����");
			}
			
			
		} else {
			System.out.println("���� ������ ��������");

		}
		
		
	}
	
	
	public void removeMember() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ��'� �������� �����: ");
		String name = sc.next();
		
		System.out.println("������ �� �������� �����: ");
		int age = sc.nextInt();
		
		boolean correct = isMemberExist (zooClub, name, age);
		
		if (correct) {
			Iterator<Entry<Person, ArrayList<Animal>>> zooClubMember = zooClub.entrySet().iterator();
			while(zooClubMember.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = zooClubMember.next();
				if(entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
					zooClubMember.remove();
					System.out.println( entry.getKey().toString() +" ��������� � �����");
				}
				}
			
		}else {
			System.out.println("���� ������ ��������");
		}
		
		
	}
	
	
	public void removeAnimalForAllMember() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������� ���������� ��� �����, ��� �������� �� � ��� ��������");
		String typeAnimal = sc.next();
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator4 = zooClub.entrySet().iterator();
		
		while (iterator4.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry = iterator4.next();
			
			ArrayList<Animal> animalArray = entry.getValue();
			Iterator<Animal> iterator5 = animalArray.iterator();
			
			while (iterator5.hasNext()) {
				Animal animal = (Animal) iterator5.next();
				if(animal.getTypeAnimal().equalsIgnoreCase(typeAnimal)) {
					iterator5.remove();
					System.out.println("������� �������");
				}
			}
			
		}
		
	}
	
	public void viewAll() {
		Set<Entry<Person, ArrayList<Animal>>> zooClubMember = zooClub.entrySet();
		System.out.println("�� �������: ");
		
		for (Entry<Person, ArrayList<Animal>> entry : zooClubMember) {
			System.out.println("������� "+ entry.getKey() + "�� �������" +entry.getValue());
		}
	}
	

	private boolean isAnimalExist(String typeAnimal, String nameAnimal) {
		boolean flag =false;
		
		Iterator<Entry<Person, ArrayList<Animal>>> iterator2 = zooClub.entrySet().iterator();
		while (iterator2.hasNext()) {
			Entry<Person, ArrayList<Animal>> entry2 =  iterator2.next();
			ArrayList<Animal> animalArray = entry2.getValue();
			
			Iterator<Animal> iterator3 = animalArray.iterator();
			
			while (iterator3.hasNext()) {
				Animal animal = iterator3.next();
				if (animal.getNameAnimal().equalsIgnoreCase(nameAnimal) && animal.getTypeAnimal().equalsIgnoreCase(typeAnimal)) {
					flag = true;
				
				}
			}
		}
		
		
		return flag;
	}

	private boolean isMemberExist(Map<Person, ArrayList<Animal>> zooClub2, String name, int age) {
		boolean flag = false;
		
		
		Set<Entry<Person, ArrayList<Animal>>> zooClubMember = zooClub.entrySet();
		
		for (Entry<Person, ArrayList<Animal>> entry : zooClubMember) {
			if(entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
				flag = true;
			}
		}
		return flag;
	}
	

}



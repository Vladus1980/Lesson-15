package Ex_01;

public class Animal {
	
	String typeAnimal;
	String nameAnimal;
	public Animal(String typeAnimal, String nameAnimal) {
		super();
		this.typeAnimal = typeAnimal;
		this.nameAnimal = nameAnimal;
	}
	public String getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	public String getNameAnimal() {
		return nameAnimal;
	}
	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	@Override
	public String toString() {
		return "Animal [typeAnimal=" + typeAnimal + ", nameAnimal=" + nameAnimal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAnimal == null) ? 0 : nameAnimal.hashCode());
		result = prime * result + ((typeAnimal == null) ? 0 : typeAnimal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nameAnimal == null) {
			if (other.nameAnimal != null)
				return false;
		} else if (!nameAnimal.equals(other.nameAnimal))
			return false;
		if (typeAnimal == null) {
			if (other.typeAnimal != null)
				return false;
		} else if (!typeAnimal.equals(other.typeAnimal))
			return false;
		return true;
	}
	
	

}



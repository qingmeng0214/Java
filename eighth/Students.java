public class Students implements Comparable<Students>{
	private int id;
	private String name;
	private int age;
	 public Students(int id, String name, int age) {
	        this.name = name;
	        this.id = id;
	        this.age = age;
	        
	    }

	 public String getName() {
	        return name;
	 }
	 
	 public void setName(String name) {
	        this.name = name;
	 }
	 
	 public Integer getId() {
	        return id;
	 }
	 
	 public void setId(Integer id) {
	        this.id = id;
	 }
	 
	 public int getAge() {
	        return age;
	 }
	 public void setAge(int age) {
	        this.age = age;
	 }
	
	 public int compareTo(Students stu) {
		return this.age-stu.age;
	 }
	 public String toString() {
		return  age + "\t" + name + 
				"\t" + id ;
	 }
}
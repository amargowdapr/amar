class students{
private String name;
public String get_Name(){
return name;
}
public void set_Name(String nmae){
this.name=name;
}}
class encap{
public static void main(String args[]){
students s=new students();
s.set_Name("aaaa");
System.out.println("Students name:"+ s.get_Name());
}}
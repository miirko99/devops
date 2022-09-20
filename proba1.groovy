import groovy.transform.ToString

def arr=[1,2,5,4,3,4,6]
println(arr[1..5])
println(arr[3,4])

for(i in arr){
  println(i)
}


def map=[1:'jedan',2:'dva',3:'tri',4:'cetri']
map[5]="pet"

for(i in arr){
  map[i]?println(map[i]):println("nije pronadjen")
}

@ToString
class Student{
  String name;
  int age;
  int index;
  int year;
  def ocene;
  Student(String name, int age){
    this.name=name
    this.age=age
  }
  Student(String name,int age,int index,int year){
    this.name=name
    this.age=age
    this. index=index
    this.year=year
  }
  void addocene(ocene){
    this.ocene=ocene
  }

}
st=new Student("mirko",23)
st1=new Student("marko",23)
st2=new Student("jovan",23)

def students=[st,st1,st2]
def s=students.find{it.name=="mirko"}
name=s?.name
println(name)
s=students.find{it.name=="Mirko"}// veliko pocetno slovo znaci vraca null
name=s?.name
println(name)



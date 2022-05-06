import os.path

myfile=input("enter file name: ");
mf=os.path.exists(myfile);

class emp:
    def create(self,ch1):
        if mf:
            f = open(myfile,"w");
            self.uid=input("enter id: ")
            self.name = input("enter name: ");
            self.age=input("enter age: ");
            self.salary=input("enter salary: ");
            #self.desig=input("enter desig: ");
            if(ch1==1):
                self.desig = "clerk";
            elif(ch1==2):
                self.desig = "programmer";
            elif(ch1==3):
                self.desig = "developer";
            elif(ch1==4):
                self.desig = "manager";
            else:
                self.desig = "invalid input";
            m = [self.uid, self.name, self.age, self.salary, self.desig];
            for i in m:
                f.write(i);
                f.write("\t");
            f.close();
            
    def display(self):
        print("id :",self.uid);
        print("name :",self.name);
        print("age :",self.age);
        print("salary :",self.salary);
        print("desig :",self.desig);
        
    def raisesal(self):
        print("id :",self.uid);
        print("name :",self.name);
        print("age :",self.age);
        print("salary :",self.salary+20000);
        print("desig :",self.desig);

            
print("hello");
ch=0;
#while(ch<5):
e = emp();

    
if mf:
    while(ch!=5):
        ch = int(input("MENU\n 1.create\n 2.display\n 3.risesal\n 4.exit\n"));
        if(ch==1):
            ch1 = int(input("MENU\n 1.clerk\n 2.programmer\n 3.developer\n 4.manager\n 5.exit\n"));
            e.create(ch1);
           
        elif(ch==2):
            e.display();
        elif(ch==3):
            e.raisesal();
        elif(ch==4):
            break;
        else:
            print("invalid input");
        #m = [name, age, salary, desig]

else:
    print("file not found...");
    
mfr=input("enter file name: ");
fr=open(mfr,"r");

for i in fr:
    print(i);
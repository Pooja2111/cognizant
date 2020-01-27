class Shape { 
   Shape(a) { 
      this.Area = a
   } 
} 
class Circle extends Shape { 
    disp(r){
       this.Area=r*r*3.14;
      console.log("Area of the circle:  "+this.Area)
    }
} 
class Rectangle extends Shape
{    disp(l,b){
        this.Area=l*b;
        console.log("Area of rectangle: "+this.Area)
    }
}
var obj1=new Rectangle();
obj1.disp(5,6)
var obj=new Circle();
obj.disp(6)


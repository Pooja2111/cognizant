class Car
{  
    constructor(name,id)
    {
    this.name=name
    this.id=id
    }
    run()
    {
        console.log("this is car")
    }
}
class Maruthi extends Car{
    constructor(speed)
    {   
        super();
        this.speed=speed   
    }
    run()
    {
        super.run();
        console.log("speed="+this.speed); 
    }
}
class MaruthiCar extends Maruthi{
    constructor(color)
    {   
        super();
        this.color=color
    }
    run()
    {
         super.run();
         console.log("color:"+this.color);
    }
}
var speed=new Maruthi(90)
speed.run();
var color=new MaruthiCar("blue")
color.run();
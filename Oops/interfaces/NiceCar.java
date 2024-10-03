 package Oops.interfaces;

 public class NiceCar  {
private Engine engine;
private Media player = new CDPlayer();

public NiceCar(){
   this. engine = new PowerEngine();
}

// public void NiceCar(Engine engine){
//     this.engine = engine;
// }

public void start(){
    engine.start();
}
public void stop(){
    engine.stop();
}

public void accl(){
    engine.accl();
}

public void startMusic(){
    player.start();
}

public void upgradeEngine(){
   this.engine = new ElectricEngine();
}
}
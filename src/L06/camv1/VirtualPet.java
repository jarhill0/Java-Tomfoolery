package L06.camv1;


public class VirtualPet {

    VirtualPetFace face;
    int hunger = 0;
    private boolean alive = true;

    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }

    public void feed() {
        if (alive) {
            if (hunger > 10) {
                hunger -= 10;
            } else {
                hunger = 0;
            }
            face.setMessage("Yum, thanks");
            face.setImage("normal");
        }
    }

    public void exercise() {
        if (alive) {
            hunger += 3;
            face.setMessage("1, 2, 3, jump.  Whew.");
            face.setImage("tired");
            checkifDead();
        }
    }

    public void sleep() {
        if (alive) {
            hunger++;
            face.setImage("asleep");
            checkifDead();
        }
    }

    private void checkifDead() {
        if (hunger > 10 || !alive) {
            alive = false;
            face.setImage("dead");
        }
    }


}

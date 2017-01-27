//imitate container 
public class Fire {

	public static void main(String[] args) {
		Human human = new Human();
		// this human get LaserGun
		human.setGun(new LaserGun());
		human.shoot();
		// change to IceGun
		human.setGun(new IceGun());
		human.shoot();

	}

}

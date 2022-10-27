package mingshi;

public class MingShi {
	public double health;
	public double attack;
	public double defend;
	public double speed;
	public double strike_val;
	public double strike_mul;

	public MingShi(double health, double attack, double defend, double speed, double strike_val, double strike_mul) {
		this.health = health;
		this.attack = attack;
		this.defend = defend;
		this.speed = speed;
		this.strike_val = strike_val;
		this.strike_mul = strike_mul;
	}

	public static final MingShi CaoZhi = new MingShi(9932, 3926, 1910, 102, 8, 1.6);
}



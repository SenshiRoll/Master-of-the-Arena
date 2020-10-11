package build;
/**
 * <h3><u>ATTACKING:</u></h3>
 * <pre>
-One Basic Attack can do a maximum of 10 Damage points not including any additional Crit, Burn/Bleed, or Upgrade Statuses
-All four Basic Attack's Damage points CAN'T add up to more than 25 Points of damage initially
-Your Ultimate ability can only be used ONCE during the fight and if it does damage, then the max amount of base damage it can do is 25 Points of damage
-Each move is allowed secondary abilities and statuses to be added onto them
-Chances for statuses level out to how much they're able to be used (Eye for an eye rule)
 * </pre>
 * @author senshi
 * @version 0.0.1
 */
import java.util.List;
public class Attack {
	byte damage;
	byte missChance;
	List<Status> secondary; //Status doesn't exist @since 0.0.1
}

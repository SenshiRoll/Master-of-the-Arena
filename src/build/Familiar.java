package build;
/**
 * <h3><u>FAMILIARS:</u></h3>
 * <pre>
-Familiars are allowed to be added to your Summoner's Build for the cost of one or multiple item slots
-A Tier 1 Familiar is a familiar that grants the summon with Support/Status Effects
-A Tier 1 Familiar has up to 7 health and takes up only 1 Item slot
-A Tier 2 Familiar focuses on damage as well as status effects
-A Tier 2 Familiar has up to 15 health, can deal a maximum of 8 Total damage and takes up 2 Item slots
-Every familiar that is not stunned or killed in battle will be able to attack opponent even if your summon is stunned for as long as it is active
-Similar to Items and an Ultimate, the Familiar can only be brought out to the field once per game
-Every familiar on the field can initially last only 4 turns unless other items/additional summons grant extended turns for the familiar to be in play
</pre>
 * @author senshi
 *@version 0.0.1
 */
public class Familiar extends Item{
	byte activeTurns;
	byte hp;
}

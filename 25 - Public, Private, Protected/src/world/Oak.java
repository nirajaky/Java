package world;

public class Oak extends Plant {
	public Oak() {
		// Plant.type jest niewidoczny, jest private
		// type = "Tree";
		// size jest protected wiêc dostêp jest w ca³ym pakiecie,
		// w klasie macierzystej i pod klasach
		this.size = "medium";
		// dzia³a bo s¹ w jednym pakiecie, a height nie ma zaznaczonej specyfiki
		// dostêpu
		this.height = 20;
	}
}

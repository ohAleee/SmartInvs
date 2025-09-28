package fr.minuskube.inv.content;

public record SlotPos(int row, int column) {

    public static SlotPos of(int row, int column) {
        return new SlotPos(row, column);
    }

}

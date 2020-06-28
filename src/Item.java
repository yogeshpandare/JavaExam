
public class Item {
	Tag tag;
	double price;

	Item(Tag tag, double price) {
		this.tag = tag;
		this.price = price;
	}

	enum Tag {
		EXPENSIVE, NORMAL, CHEAP
	}
}

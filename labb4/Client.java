package Eclipse_testing.labb4;

public class Client {
	
	public static void main(String []args) {
		
		// build suitcase
		Component suitcase = new Composite(1200, "suitcase");
		
		// small bag in a medium bag in a large bag in the suitcase
		Component smallBag = new Composite(10, "smallBag");
		Component mediumBag = new Composite(50, "mediumBag");
		mediumBag.Add(smallBag);
		Component largeBag = new Composite(100, "largeBag");
		largeBag.Add(mediumBag);
		suitcase.Add(largeBag);
		
		// pack the small bag with random things
		Component toothBrush = new Leaf(1, "toothBrush");
		smallBag.Add(toothBrush);
		Component gameboyAdvanced = new Leaf(2, "gameboyAdvanced");
		smallBag.Add(gameboyAdvanced);
		Component pictureOfOhio = new Leaf(3, "pictureOfOhio");
		smallBag.Add(pictureOfOhio);
		
		// pack the medium bag with clothes
		Component shirt = new Leaf(10, "shirt");
		mediumBag.Add(shirt);
		Component skirt = new Leaf(8, "skirt");
		mediumBag.Add(skirt);
		Component pants = new Leaf(20, "pants");
		mediumBag.Add(pants);
		
		
		// pack the large bag with things we should have left back home
		Component mrPotatoHeadToy = new Leaf(200, "mrPotatoHeadToy");
		largeBag.Add(mrPotatoHeadToy);
		Component wayTooMuchShampoo = new Leaf(120, "wayTooMuchShampoo");
		largeBag.Add(wayTooMuchShampoo);
		Component xBox = new Leaf(110, "xBox");
		largeBag.Add(xBox);
		Component playStation2 = new Leaf(109, "playStation2");
		largeBag.Add(playStation2);
		
		// pack suitcase with the most important thing
		Component yuGiOhCardCollection = new Leaf(130, "yuGiOhCardCollection");
		suitcase.Add(yuGiOhCardCollection);
		
		
		// print out collective weight
		System.out.println(suitcase.getWeight());
		
		// print out contents
		System.out.println(suitcase.toString().strip());
		
		// re-do with some things removed
		mediumBag.Remove(shirt);
		mediumBag.Remove(smallBag);
		
		// print out collective weight
		System.out.println(suitcase.getWeight());
		
		// print out contents
		System.out.println(suitcase.toString().strip());
		
		// Replace, then try to get toothbrush from bags
		// bigBag.Add(toothBrush);
		// System.out.println(suitcase.GetChild(toothBrush));
		// System.o+ut.println(smallBag.GetChild(toothBrush));
		// System.out.println(bigBag.GetChild(toothBrush));
		
	}

}

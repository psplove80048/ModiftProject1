

public class StorePortal {
	private String [] storenames;
	private Store [] store;

	public String [] getStorenames() {
		return storenames;
	}

	public void setStorenames(String [] storenames) {
		this.storenames = storenames;
	}
	
	public void choosestore(String storename)
	{
		for(String store : storenames)
		{
			if(store.equals(storename))
			{
				System.out.println(storename+"\n");
			}
		}
	}

}

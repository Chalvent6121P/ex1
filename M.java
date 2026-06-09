class M
{
	public static void main(String[] args) {
		String[] colors={"red","blue","green","yellow","maroon","cyan"};
		for(String c:colors)
		{
			if(c.length()!=4)
			{
				continue;
			}
			System.out.println(c+",");
		}
	}
}
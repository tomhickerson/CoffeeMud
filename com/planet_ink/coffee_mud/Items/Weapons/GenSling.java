package com.planet_ink.coffee_mud.Items.Weapons;

import com.planet_ink.coffee_mud.interfaces.*;
import com.planet_ink.coffee_mud.common.*;
import com.planet_ink.coffee_mud.utils.*;
import java.util.*;

public class GenSling extends StdSling
{
	protected String	readableText="";
	public GenSling()
	{
		super();
		myID=this.getClass().getName().substring(this.getClass().getName().lastIndexOf('.')+1);
		name="a generic sling";
		displayText="a generic sling sits here.";
		description="";
		recoverEnvStats();
	}
	public Environmental newInstance()
	{
		return new GenSling();
	}
	public boolean isGeneric(){return true;}


	public String text()
	{
		return Generic.getPropertiesStr(this,false);
	}
	public String readableText(){return readableText;}
	public void setReadableText(String text){readableText=text;}

	public void setMiscText(String newText)
	{
		miscText="";
		Generic.setPropertiesStr(this,newText,false);
		recoverEnvStats();
	}
}


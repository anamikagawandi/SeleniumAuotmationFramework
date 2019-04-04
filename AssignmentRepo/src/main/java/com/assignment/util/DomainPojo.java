package com.assignment.util;

import com.assignment.base.TestBase;

public class DomainPojo extends TestBase{

	    private String name;

	    private String lang;

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getLang ()
	    {
	        return lang;
	    }

	    public void setLang (String lang)
	    {
	        this.lang = lang;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [name = "+name+", lang = "+lang+"]";
	    }

}

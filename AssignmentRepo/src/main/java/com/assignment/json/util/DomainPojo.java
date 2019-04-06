package com.assignment.json.util;

import com.assignment.base.TestBase;

public class DomainPojo extends TestBase{

	    private String COMMUNITY;

	    private String LANG;

	    public String getCOMMUNITY ()
	    {
	        return COMMUNITY;
	    }

	    public void setCOMMUNITY (String COMMUNITY)
	    {
	        this.COMMUNITY = COMMUNITY;
	    }

	    public String getLANG ()
	    {
	        return LANG;
	    }

	    public void setLANG (String LANG)
	    {
	        this.LANG = LANG;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [COMMUNITY = "+COMMUNITY+", LANG = "+LANG+"]";
	    }

}

package es.mdbdev.cvrfparser.model.cvrf.common;

/**
 * Created by Mario on 28/01/2017.
 */
public class Reference
{
    private String Description;

    private String Type;

    private String URL;

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getURL ()
    {
        return URL;
    }

    public void setURL (String URL)
    {
        this.URL = URL;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Description = "+Description+", Type = "+Type+", URL = "+URL+"]";
    }
}

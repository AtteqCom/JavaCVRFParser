package es.mdbdev.model.cvrf.documentnotes;

/**
 * Created by Mario on 28/01/2017.
 */
public class Note
{
    private String content;

    private String Type;

    private String Ordinal;

    private String Title;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getType ()
    {
        return Type;
    }

    public void setType (String Type)
    {
        this.Type = Type;
    }

    public String getOrdinal ()
    {
        return Ordinal;
    }

    public void setOrdinal (String Ordinal)
    {
        this.Ordinal = Ordinal;
    }

    public String getTitle ()
    {
        return Title;
    }

    public void setTitle (String Title)
    {
        this.Title = Title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", Type = "+Type+", Ordinal = "+Ordinal+", Title = "+Title+"]";
    }
}

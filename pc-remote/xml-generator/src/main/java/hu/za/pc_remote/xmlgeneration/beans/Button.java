package hu.za.pc_remote.xmlgeneration.beans;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: Andor
 * Date: 10/23/11
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class Button {
    @XmlAttribute
    public String actionType;
    @XmlAttribute
    public String text;
    @XmlAttribute
    public int[] args;
}

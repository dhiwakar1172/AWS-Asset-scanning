package org.details;

import java.util.List;

public class InboundRules {

     private String FromPort;
    private String ToPort;
    private String IPProtocol;
    private List IPv4Ranges;
    private List IPv6Ranges;

    public InboundRules(){

    }
    public InboundRules(String fromPort, String toPort, String IPProtocol, List IPv4Ranges, List IPv6Ranges) {
        FromPort = fromPort;
        ToPort = toPort;
        this.IPProtocol = IPProtocol;
        this.IPv4Ranges = IPv4Ranges;
        this.IPv6Ranges = IPv6Ranges;
    }

    public String getFromPOrt() {
        return FromPort;
    }

    public void setFromPOrt(String fromPOrt) {
        FromPort = fromPOrt;
    }

    public String getToPort() {
        return ToPort;
    }

    public void setToPort(String toPort) {
        ToPort = toPort;
    }

    public String getIPProtocol() {
        return IPProtocol;
    }

    public void setIPProtocol(String IPProtocol) {
        this.IPProtocol = IPProtocol;
    }

    public List getIPv4Ranges() {
        return IPv4Ranges;
    }

    public void setIPv4Ranges(List IPv4Ranges) {
        this.IPv4Ranges = IPv4Ranges;
    }

    public List getIPv6Ranges() {
        return IPv6Ranges;
    }

    public void setIPv6Ranges(List IPv6Ranges) {
        this.IPv6Ranges = IPv6Ranges;
    }

    @Override
    public String toString() {
        return
                "\tFromPort='" + FromPort + '\'' +
                ", ToPort='" + ToPort + '\'' +
                ", IPProtocol='" + IPProtocol + '\'' +
                ", IPv4Ranges=" + IPv4Ranges +
                ", IPv6Ranges=" + IPv6Ranges+"\n"
                ;
    }
}

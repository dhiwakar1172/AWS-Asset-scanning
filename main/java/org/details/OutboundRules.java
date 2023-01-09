package org.details;

import java.util.List;

public class OutboundRules {


    private String IPProtocol;
    private List IPv4Ranges;
    private List IPv6Ranges;

    public void setIPProtocol(String IPProtocol) {
        this.IPProtocol = IPProtocol;
    }

    public void setIPv4Ranges(List IPv4Ranges) {
        this.IPv4Ranges = IPv4Ranges;
    }

    public OutboundRules(){

    }
    public OutboundRules(String IPProtocol, List IPv4Ranges, List IPv6Ranges) {

        this.IPProtocol = IPProtocol;
        this.IPv4Ranges = IPv4Ranges;
        this.IPv6Ranges = IPv6Ranges;
    }

    public String getIPProtocol() {
        return IPProtocol;
    }


    public List getIPv4Ranges() {
        return IPv4Ranges;
    }


    public List getIPv6Ranges() {
        return IPv6Ranges;
    }

    public void setIPv6Ranges(List IPv6Ranges) {
        this.IPv6Ranges = IPv6Ranges;
    }

    @Override
    public String toString() {
        return  "\tIPProtocol='" + IPProtocol + '\'' +
                        ", IPv4Ranges=" + IPv4Ranges +
                        ", IPv6Ranges=" + IPv6Ranges+"\n"
                ;
    }
}

package danilov.communication;

public class Router {
    public Router(Iterable<Route> routes) {}
    public void addRoute() {}
    public Route getRouteForAddress(IPv4Address address) {}
    public Iterable<Route> getRoutes() {}
    public void removeRoute(Route route) {}
}

module pattern.ten.facade {
    requires transitive module.one;
    requires transitive module.two;
    exports pattern.ten.external;
}
package org.example;

import java.nio.file.Path;

public interface EmployeeSerializer<E extends Employee> {
    Path serialize(E obj);

    E deserialize(Path path);
}

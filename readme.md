# JPA Attribute converter

The  @Converter annotation provided for converter class may have the `autoApply` attribute.
If set to `true`, it allows the entity fields of the specific (converted) type 
to miss the `@Convert` annotation: the converter will be implicitly applied for all attributes 
of this specific type.

Actually IDEA reports the error for the not-annotated fields

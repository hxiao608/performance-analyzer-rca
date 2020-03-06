// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * <pre>
 *Enum for different resource type
 * </pre>
 *
 * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions}
 */
public  final class ResourceTypeOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)
    ResourceTypeOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceTypeOptions.newBuilder() to construct.
  private ResourceTypeOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceTypeOptions() {
    resourceTypeName_ = "";
    resourceTypeUnit_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResourceTypeOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceTypeName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceTypeUnit_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceTypeOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceTypeOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.Builder.class);
  }

  public static final int RESOURCETYPENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceTypeName_;
  /**
   * <code>string resourceTypeName = 1;</code>
   */
  public java.lang.String getResourceTypeName() {
    java.lang.Object ref = resourceTypeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceTypeName_ = s;
      return s;
    }
  }
  /**
   * <code>string resourceTypeName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeNameBytes() {
    java.lang.Object ref = resourceTypeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceTypeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCETYPEUNIT_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceTypeUnit_;
  /**
   * <code>string resourceTypeUnit = 2;</code>
   */
  public java.lang.String getResourceTypeUnit() {
    java.lang.Object ref = resourceTypeUnit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceTypeUnit_ = s;
      return s;
    }
  }
  /**
   * <code>string resourceTypeUnit = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeUnitBytes() {
    java.lang.Object ref = resourceTypeUnit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceTypeUnit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResourceTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceTypeName_);
    }
    if (!getResourceTypeUnitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceTypeUnit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceTypeName_);
    }
    if (!getResourceTypeUnitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceTypeUnit_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)) {
      return super.equals(obj);
    }
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions other = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions) obj;

    if (!getResourceTypeName()
        .equals(other.getResourceTypeName())) return false;
    if (!getResourceTypeUnit()
        .equals(other.getResourceTypeUnit())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESOURCETYPENAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceTypeName().hashCode();
    hash = (37 * hash) + RESOURCETYPEUNIT_FIELD_NUMBER;
    hash = (53 * hash) + getResourceTypeUnit().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *Enum for different resource type
   * </pre>
   *
   * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceTypeOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceTypeOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.Builder.class);
    }

    // Construct using com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      resourceTypeName_ = "";

      resourceTypeUnit_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_ResourceTypeOptions_descriptor;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions getDefaultInstanceForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions build() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions buildPartial() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions result = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions(this);
      result.resourceTypeName_ = resourceTypeName_;
      result.resourceTypeUnit_ = resourceTypeUnit_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions) {
        return mergeFrom((com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions other) {
      if (other == com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions.getDefaultInstance()) return this;
      if (!other.getResourceTypeName().isEmpty()) {
        resourceTypeName_ = other.resourceTypeName_;
        onChanged();
      }
      if (!other.getResourceTypeUnit().isEmpty()) {
        resourceTypeUnit_ = other.resourceTypeUnit_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceTypeName_ = "";
    /**
     * <code>string resourceTypeName = 1;</code>
     */
    public java.lang.String getResourceTypeName() {
      java.lang.Object ref = resourceTypeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceTypeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resourceTypeName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeNameBytes() {
      java.lang.Object ref = resourceTypeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resourceTypeName = 1;</code>
     */
    public Builder setResourceTypeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceTypeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resourceTypeName = 1;</code>
     */
    public Builder clearResourceTypeName() {
      
      resourceTypeName_ = getDefaultInstance().getResourceTypeName();
      onChanged();
      return this;
    }
    /**
     * <code>string resourceTypeName = 1;</code>
     */
    public Builder setResourceTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceTypeName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceTypeUnit_ = "";
    /**
     * <code>string resourceTypeUnit = 2;</code>
     */
    public java.lang.String getResourceTypeUnit() {
      java.lang.Object ref = resourceTypeUnit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceTypeUnit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string resourceTypeUnit = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeUnitBytes() {
      java.lang.Object ref = resourceTypeUnit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceTypeUnit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string resourceTypeUnit = 2;</code>
     */
    public Builder setResourceTypeUnit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceTypeUnit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string resourceTypeUnit = 2;</code>
     */
    public Builder clearResourceTypeUnit() {
      
      resourceTypeUnit_ = getDefaultInstance().getResourceTypeUnit();
      onChanged();
      return this;
    }
    /**
     * <code>string resourceTypeUnit = 2;</code>
     */
    public Builder setResourceTypeUnitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceTypeUnit_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)
  }

  // @@protoc_insertion_point(class_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions)
  private static final com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions();
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceTypeOptions>
      PARSER = new com.google.protobuf.AbstractParser<ResourceTypeOptions>() {
    @java.lang.Override
    public ResourceTypeOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResourceTypeOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResourceTypeOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceTypeOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ResourceTypeOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


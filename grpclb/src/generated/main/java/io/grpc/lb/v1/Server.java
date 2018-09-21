// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lb/v1/load_balancer.proto

package io.grpc.lb.v1;

/**
 * <pre>
 * Contains server information. When the drop field is not true, use the other
 * fields.
 * </pre>
 *
 * Protobuf type {@code grpc.lb.v1.Server}
 */
public  final class Server extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.lb.v1.Server)
    ServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Server.newBuilder() to construct.
  private Server(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Server() {
    ipAddress_ = com.google.protobuf.ByteString.EMPTY;
    port_ = 0;
    loadBalanceToken_ = "";
    drop_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Server(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            ipAddress_ = input.readBytes();
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            loadBalanceToken_ = s;
            break;
          }
          case 32: {

            drop_ = input.readBool();
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
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_Server_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_Server_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.lb.v1.Server.class, io.grpc.lb.v1.Server.Builder.class);
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString ipAddress_;
  /**
   * <pre>
   * A resolved address for the server, serialized in network-byte-order. It may
   * either be an IPv4 or IPv6 address.
   * </pre>
   *
   * <code>bytes ip_address = 1;</code>
   */
  public com.google.protobuf.ByteString getIpAddress() {
    return ipAddress_;
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * A resolved port number for the server.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int LOAD_BALANCE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object loadBalanceToken_;
  /**
   * <pre>
   * An opaque but printable token for load reporting. The client must include
   * the token of the picked server into the initial metadata when it starts a
   * call to that server. The token is used by the server to verify the request
   * and to allow the server to report load to the gRPC LB system. The token is
   * also used in client stats for reporting dropped calls.
   * Its length can be variable but must be less than 50 bytes.
   * </pre>
   *
   * <code>string load_balance_token = 3;</code>
   */
  public java.lang.String getLoadBalanceToken() {
    java.lang.Object ref = loadBalanceToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loadBalanceToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An opaque but printable token for load reporting. The client must include
   * the token of the picked server into the initial metadata when it starts a
   * call to that server. The token is used by the server to verify the request
   * and to allow the server to report load to the gRPC LB system. The token is
   * also used in client stats for reporting dropped calls.
   * Its length can be variable but must be less than 50 bytes.
   * </pre>
   *
   * <code>string load_balance_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLoadBalanceTokenBytes() {
    java.lang.Object ref = loadBalanceToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loadBalanceToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DROP_FIELD_NUMBER = 4;
  private boolean drop_;
  /**
   * <pre>
   * Indicates whether this particular request should be dropped by the client.
   * If the request is dropped, there will be a corresponding entry in
   * ClientStats.calls_finished_with_drop.
   * </pre>
   *
   * <code>bool drop = 4;</code>
   */
  public boolean getDrop() {
    return drop_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!ipAddress_.isEmpty()) {
      output.writeBytes(1, ipAddress_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!getLoadBalanceTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, loadBalanceToken_);
    }
    if (drop_ != false) {
      output.writeBool(4, drop_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!ipAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, ipAddress_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (!getLoadBalanceTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, loadBalanceToken_);
    }
    if (drop_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, drop_);
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
    if (!(obj instanceof io.grpc.lb.v1.Server)) {
      return super.equals(obj);
    }
    io.grpc.lb.v1.Server other = (io.grpc.lb.v1.Server) obj;

    boolean result = true;
    result = result && getIpAddress()
        .equals(other.getIpAddress());
    result = result && (getPort()
        == other.getPort());
    result = result && getLoadBalanceToken()
        .equals(other.getLoadBalanceToken());
    result = result && (getDrop()
        == other.getDrop());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + LOAD_BALANCE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getLoadBalanceToken().hashCode();
    hash = (37 * hash) + DROP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDrop());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.lb.v1.Server parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.Server parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.lb.v1.Server parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.Server parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.Server parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.lb.v1.Server parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.lb.v1.Server prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Contains server information. When the drop field is not true, use the other
   * fields.
   * </pre>
   *
   * Protobuf type {@code grpc.lb.v1.Server}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.lb.v1.Server)
      io.grpc.lb.v1.ServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_Server_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_Server_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.lb.v1.Server.class, io.grpc.lb.v1.Server.Builder.class);
    }

    // Construct using io.grpc.lb.v1.Server.newBuilder()
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
    public Builder clear() {
      super.clear();
      ipAddress_ = com.google.protobuf.ByteString.EMPTY;

      port_ = 0;

      loadBalanceToken_ = "";

      drop_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.lb.v1.LoadBalancerProto.internal_static_grpc_lb_v1_Server_descriptor;
    }

    public io.grpc.lb.v1.Server getDefaultInstanceForType() {
      return io.grpc.lb.v1.Server.getDefaultInstance();
    }

    public io.grpc.lb.v1.Server build() {
      io.grpc.lb.v1.Server result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.lb.v1.Server buildPartial() {
      io.grpc.lb.v1.Server result = new io.grpc.lb.v1.Server(this);
      result.ipAddress_ = ipAddress_;
      result.port_ = port_;
      result.loadBalanceToken_ = loadBalanceToken_;
      result.drop_ = drop_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.lb.v1.Server) {
        return mergeFrom((io.grpc.lb.v1.Server)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.lb.v1.Server other) {
      if (other == io.grpc.lb.v1.Server.getDefaultInstance()) return this;
      if (other.getIpAddress() != com.google.protobuf.ByteString.EMPTY) {
        setIpAddress(other.getIpAddress());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getLoadBalanceToken().isEmpty()) {
        loadBalanceToken_ = other.loadBalanceToken_;
        onChanged();
      }
      if (other.getDrop() != false) {
        setDrop(other.getDrop());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.lb.v1.Server parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.lb.v1.Server) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString ipAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * A resolved address for the server, serialized in network-byte-order. It may
     * either be an IPv4 or IPv6 address.
     * </pre>
     *
     * <code>bytes ip_address = 1;</code>
     */
    public com.google.protobuf.ByteString getIpAddress() {
      return ipAddress_;
    }
    /**
     * <pre>
     * A resolved address for the server, serialized in network-byte-order. It may
     * either be an IPv4 or IPv6 address.
     * </pre>
     *
     * <code>bytes ip_address = 1;</code>
     */
    public Builder setIpAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A resolved address for the server, serialized in network-byte-order. It may
     * either be an IPv4 or IPv6 address.
     * </pre>
     *
     * <code>bytes ip_address = 1;</code>
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * A resolved port number for the server.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * A resolved port number for the server.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A resolved port number for the server.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object loadBalanceToken_ = "";
    /**
     * <pre>
     * An opaque but printable token for load reporting. The client must include
     * the token of the picked server into the initial metadata when it starts a
     * call to that server. The token is used by the server to verify the request
     * and to allow the server to report load to the gRPC LB system. The token is
     * also used in client stats for reporting dropped calls.
     * Its length can be variable but must be less than 50 bytes.
     * </pre>
     *
     * <code>string load_balance_token = 3;</code>
     */
    public java.lang.String getLoadBalanceToken() {
      java.lang.Object ref = loadBalanceToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loadBalanceToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An opaque but printable token for load reporting. The client must include
     * the token of the picked server into the initial metadata when it starts a
     * call to that server. The token is used by the server to verify the request
     * and to allow the server to report load to the gRPC LB system. The token is
     * also used in client stats for reporting dropped calls.
     * Its length can be variable but must be less than 50 bytes.
     * </pre>
     *
     * <code>string load_balance_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLoadBalanceTokenBytes() {
      java.lang.Object ref = loadBalanceToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loadBalanceToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An opaque but printable token for load reporting. The client must include
     * the token of the picked server into the initial metadata when it starts a
     * call to that server. The token is used by the server to verify the request
     * and to allow the server to report load to the gRPC LB system. The token is
     * also used in client stats for reporting dropped calls.
     * Its length can be variable but must be less than 50 bytes.
     * </pre>
     *
     * <code>string load_balance_token = 3;</code>
     */
    public Builder setLoadBalanceToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loadBalanceToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An opaque but printable token for load reporting. The client must include
     * the token of the picked server into the initial metadata when it starts a
     * call to that server. The token is used by the server to verify the request
     * and to allow the server to report load to the gRPC LB system. The token is
     * also used in client stats for reporting dropped calls.
     * Its length can be variable but must be less than 50 bytes.
     * </pre>
     *
     * <code>string load_balance_token = 3;</code>
     */
    public Builder clearLoadBalanceToken() {
      
      loadBalanceToken_ = getDefaultInstance().getLoadBalanceToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An opaque but printable token for load reporting. The client must include
     * the token of the picked server into the initial metadata when it starts a
     * call to that server. The token is used by the server to verify the request
     * and to allow the server to report load to the gRPC LB system. The token is
     * also used in client stats for reporting dropped calls.
     * Its length can be variable but must be less than 50 bytes.
     * </pre>
     *
     * <code>string load_balance_token = 3;</code>
     */
    public Builder setLoadBalanceTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loadBalanceToken_ = value;
      onChanged();
      return this;
    }

    private boolean drop_ ;
    /**
     * <pre>
     * Indicates whether this particular request should be dropped by the client.
     * If the request is dropped, there will be a corresponding entry in
     * ClientStats.calls_finished_with_drop.
     * </pre>
     *
     * <code>bool drop = 4;</code>
     */
    public boolean getDrop() {
      return drop_;
    }
    /**
     * <pre>
     * Indicates whether this particular request should be dropped by the client.
     * If the request is dropped, there will be a corresponding entry in
     * ClientStats.calls_finished_with_drop.
     * </pre>
     *
     * <code>bool drop = 4;</code>
     */
    public Builder setDrop(boolean value) {
      
      drop_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether this particular request should be dropped by the client.
     * If the request is dropped, there will be a corresponding entry in
     * ClientStats.calls_finished_with_drop.
     * </pre>
     *
     * <code>bool drop = 4;</code>
     */
    public Builder clearDrop() {
      
      drop_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.lb.v1.Server)
  }

  // @@protoc_insertion_point(class_scope:grpc.lb.v1.Server)
  private static final io.grpc.lb.v1.Server DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.lb.v1.Server();
  }

  public static io.grpc.lb.v1.Server getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Server>
      PARSER = new com.google.protobuf.AbstractParser<Server>() {
    public Server parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Server(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Server> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Server> getParserForType() {
    return PARSER;
  }

  public io.grpc.lb.v1.Server getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


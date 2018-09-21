// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface ServerDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.ServerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A trace of recent events on the server.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ChannelTrace trace = 1;</code>
   */
  boolean hasTrace();
  /**
   * <pre>
   * A trace of recent events on the server.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ChannelTrace trace = 1;</code>
   */
  io.grpc.channelz.v1.ChannelTrace getTrace();
  /**
   * <pre>
   * A trace of recent events on the server.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ChannelTrace trace = 1;</code>
   */
  io.grpc.channelz.v1.ChannelTraceOrBuilder getTraceOrBuilder();

  /**
   * <pre>
   * The number of incoming calls started on the server
   * </pre>
   *
   * <code>int64 calls_started = 2;</code>
   */
  long getCallsStarted();

  /**
   * <pre>
   * The number of incoming calls that have completed with an OK status
   * </pre>
   *
   * <code>int64 calls_succeeded = 3;</code>
   */
  long getCallsSucceeded();

  /**
   * <pre>
   * The number of incoming calls that have a completed with a non-OK status
   * </pre>
   *
   * <code>int64 calls_failed = 4;</code>
   */
  long getCallsFailed();

  /**
   * <pre>
   * The last time a call was started on the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_call_started_timestamp = 5;</code>
   */
  boolean hasLastCallStartedTimestamp();
  /**
   * <pre>
   * The last time a call was started on the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_call_started_timestamp = 5;</code>
   */
  com.google.protobuf.Timestamp getLastCallStartedTimestamp();
  /**
   * <pre>
   * The last time a call was started on the server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_call_started_timestamp = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastCallStartedTimestampOrBuilder();
}
